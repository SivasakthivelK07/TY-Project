package org.tys.jspiders.jms;

import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Persistence.createEntityManagerFactory("MySQL_01");
    }
}
