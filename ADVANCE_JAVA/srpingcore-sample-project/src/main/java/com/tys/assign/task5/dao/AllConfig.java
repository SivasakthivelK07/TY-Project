package com.tys.assign.task5.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ FishConfig.class, CatConfig.class, CowConfig.class, DogConfig.class })
public class AllConfig {

}
