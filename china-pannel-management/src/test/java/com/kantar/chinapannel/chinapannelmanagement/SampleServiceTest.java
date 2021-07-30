package com.kantar.chinapannel.chinapannelmanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kantar.chinapannel.chinapannelmanagement.model.Sample;
import com.kantar.chinapannel.chinapannelmanagement.model.SampleStatus;
import com.kantar.chinapannel.chinapannelmanagement.model.StudySample;
import com.kantar.chinapannel.chinapannelmanagement.model.Survey;
import com.kantar.chinapannel.chinapannelmanagement.repository.SampleRepository;
import com.kantar.chinapannel.chinapannelmanagement.service.SampleService;

public class SampleServiceTest {
	
	@InjectMocks
	SampleService sampleServ;
	
	@Mock
	SampleRepository sampleRepo;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testFindSample() { 
		
		
		
		Sample  sample=new Sample();
		List<Sample> sampleValues=new ArrayList<>();
		sample.setId(1234L);
		sample.setSampleName("DEVCME-130");
		sample.setDescription("sampleDescription");
		sample.setJobType("jobType");
		sample.setQueuePriority(234L);
		
		sampleValues.add(sample);
		//studySample.setStudy("test1");
		
		for(Sample sampleList:sampleValues) {
			StudySample studySample=new StudySample();
			
			studySample.setJobType(sampleList.getJobType());
			studySample.setStudy("F TEST 1");
			studySample.setSampleName(sampleList.getSampleName());
			studySample.setStudy("test1");
			
			System.out.println("sampleName"+sampleList.getSampleName());
			
			when(sampleRepo.findBySampleNameOrJobType(anyString(), anyString())).thenReturn(sampleValues);
			
			
			
			 studySample=sampleServ.findBySamples("DEVCME-130", "jobType");
			
			assertEquals("DEVCME-130", sampleList.getSampleName());
			
			
		}
		
		
		
		
		
	}
	

}
