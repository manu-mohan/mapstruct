package com.manumohan.bfs.mapstruct;

import com.manumohan.bfs.mapstruct.mapper.PartyMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MapstructApplicationTests
{
	@Autowired
	private PartyMapper partyMapper;

	@Test
	void contextLoads()
	{
	}

}
