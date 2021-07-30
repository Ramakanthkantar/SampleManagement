package com.kantar.chinapannel.chinapannelmanagement.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kantar.chinapannel.chinapannelmanagement.model.Sample;
import com.kantar.chinapannel.chinapannelmanagement.model.StudySample;
import com.kantar.chinapannel.chinapannelmanagement.repository.SampleRepository;

@Service
public class SampleService {

	//final Logger logger = LoggerFactory.getLogger(SampleService.class);
	private static final Logger LOGGER=LoggerFactory.getLogger(SampleService.class);

	@Autowired
	SampleRepository sampleRepository;


	public StudySample findBySamples(String name, String jobType) {

		LOGGER.debug("service method");

		List<Sample> sampleList = sampleRepository.findBySampleNameOrJobType(name, jobType);

		StudySample sample = new StudySample();		
		for (Sample sampleValues : sampleList) {
			if (sampleValues.getSvy_id() != null && !sampleValues.getSvy_id().toString().isEmpty()
					&& sampleValues.getStudy().getName() != null && sampleValues.getStudy() != null) {
				sample.setId(sampleValues.getId());
				sample.setSampleName(sampleValues.getSampleName());
				sample.setStudy(sampleValues.getStudy().getName());
				sample.setSvyId(sampleValues.getSvy_id());
				sample.setJobType(sampleValues.getJobType());
				sample.setSampleDescription(sampleValues.getDescription());
				sample.setSampleStatus(sampleValues.getSampleStatus().getName());
				sample.setQueuePriority(sampleValues.getQueuePriority());
			}

		}
		return sample;
	}
}
