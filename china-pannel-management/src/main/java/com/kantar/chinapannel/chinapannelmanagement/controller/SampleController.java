package com.kantar.chinapannel.chinapannelmanagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kantar.chinapannel.chinapannelmanagement.model.Sample;
import com.kantar.chinapannel.chinapannelmanagement.model.StudySample;
import com.kantar.chinapannel.chinapannelmanagement.service.SampleService;

@RestController
@RequestMapping("/api/v1")
public class SampleController {
	

	@Autowired
	SampleService sampleService;
	
	/*
	 * @GetMapping("/sample") public StudySample
	 * findBySampleName(@RequestParam(name="name") String sampleName,@RequestParam
	 * String jobType){ final Logger logger =
	 * LoggerFactory.getLogger(SampleController.class); logger.debug("incontroler");
	 * 
	 * return surveyService.findBySamples(sampleName,jobType); }
	 */
	
	
	@GetMapping("/sample")
	public ResponseEntity<StudySample> findBySampleName(@RequestParam(name="name") String sampleName,@RequestParam String jobType){
		 final Logger logger = LoggerFactory.getLogger(SampleController.class);
		 
		 
		 StudySample studySamples=sampleService.findBySamples(sampleName,jobType);
		 
		 logger.debug("incontroler",studySamples.getStudy());
		
		return new ResponseEntity<StudySample>(studySamples,HttpStatus.OK);
	}
	}


