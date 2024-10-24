package com.tyss.jspiders.filter;

import com.tyss.jspiders.jwt.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * After successfully implementation registration and login api, and also
 * generation token after successful login. We created a custom filter using
 * OncePerRequestFilter. The filter has method called doFilterInternal() which
 * executes whenever a request hits the application before going to the controller.
 */
@RequiredArgsConstructor
@Component
public class SecurityFilter extends OncePerRequestFilter {

    private final JwtUtils jwtUtils;
    private final UserDetailsService userDetailsService;

    /*
     * This method first extracts the bearer token from the request header. The
     * header is of type Authorization. Then we checked if the token is not null and
     * starts with the word "Bearer ". When above condition was true we again
     * extracted the actual token using substring. We then used JwtUtils
     * getUsername() method to generate the username out of the token and checked
     * whether there is a user with the same username in the database or not. It is
     * also very important to check the SecurityContextHolder having SecurityContext
     * information, it should be null in the beginning i.e. no user has got
     * authenticated.
     *
     * The SecurityContext and SecurityContextHolder are two fundamental classes of
     * Spring Security. The SecurityContext is used to store the details of the
     * currently authenticated user, also known as a principle.
     *
     * The SecurityContextHolder is a helper class, which provides access to the
     * security context.
     *
     * After this we validate the token against the username stored in the database
     * using JwtUtils validateToken method. Then we create
     * UsernamePasswordAuthenticationToken type object and set the details because
     * to set the information about the currently authenticated user in the
     * SecurityContext we need Authentication type object and
     * UsernamePasswordAuthenticationToken is Authentication type.
     *
     * But if the token is not received we call another filter through the
     * filterChain object which will take the control forward.
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        //To fetch the exist Token
        String bearerToken = request.getHeader("Authorization");
        System.out.printf("Header: "+ bearerToken);

        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            String token = bearerToken.substring(7);

            //To decode the username
            String usernameFromToken = jwtUtils.getUsername(token);
            System.out.printf("Username: "+ usernameFromToken);

            //Based on username it will fetch the data from database
            UserDetails userFromDb = userDetailsService.loadUserByUsername(usernameFromToken);
            System.out.printf("userFromDb: "+ userFromDb);

            if (usernameFromToken != null && userFromDb.getUsername() != null
                    && SecurityContextHolder.getContext().getAuthentication() == null) {
                if (jwtUtils.validateToken(token, userFromDb.getUsername())) {

                    UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                            userFromDb.getUsername(), userFromDb.getPassword(), userFromDb.getAuthorities());

                // It's used to store Ip address and request(which request its come)
                    authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                }
            }
        }
        // To transfer the control to dispatcher servlet
        filterChain.doFilter(request, response);
    }

}