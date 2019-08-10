package com.dbs.mq26;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.dbs.mq26.controller.QueueController;
import com.dbs.mq26.service.QueueService;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(QueueController.class)
public class Mq26ApplicationTests {

	@Autowired
	private MockMvc mvc; 

	@Test
	public void contextLoads() {
	}
	@MockBean
	private QueueService queueService;
	//@Test
	public void testGetAllQueues() throws Exception
	{
		mvc.perform( MockMvcRequestBuilders
				.get("/api/queue/getAllQueues")
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.queue").exists());
	}

}
