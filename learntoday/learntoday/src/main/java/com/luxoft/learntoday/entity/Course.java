package com.luxoft.learntoday.entity;
import java.util.*;

import javax.persistence.GeneratedValue;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@EntityScan
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course 
{
	@Id
	@GeneratedValue(strategy = GenerationTye.Auto)
	private Integer courseId ; 
	

}
