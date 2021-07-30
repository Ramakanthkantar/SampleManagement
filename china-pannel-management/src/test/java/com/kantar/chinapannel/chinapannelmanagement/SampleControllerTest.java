package com.kantar.chinapannel.chinapannelmanagement;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.kantar.chinapannel.chinapannelmanagement.controller.SampleController;
import com.kantar.chinapannel.chinapannelmanagement.model.StudySample;
import com.kantar.chinapannel.chinapannelmanagement.service.SampleService;

public class SampleControllerTest {
	
	@InjectMocks
	SampleController samplectrl;
	
	@Mock
	SampleService sampleServ;
	
	@Test
	public void testSample() {
		
	/*	private Long id;
		private Long svyId;
		private String sampleName;
		private String sampleDescription;
		private String jobType;
		private Long queuePriority;
		private String study;
		private String sampleStatus;
		*/
		
		StudySample sample1=new StudySample(123L,213L,"sampleName","sampleDescription","jobType",3L,"study","status");
		StudySample sample2=new StudySample(123L,213L,"sampleName","sampleDescription","jobType",3L,"study","status");
		
		
		
		
		
		
		
	}
	

}
