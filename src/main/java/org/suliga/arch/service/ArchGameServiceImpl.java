package org.suliga.arch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.suliga.arch.dao.ArchGameDao;
import org.suliga.arch.model.ArchGame;

@Service
public class ArchGameServiceImpl implements ArchGameService {
	@Autowired private ArchGameDao archGameDao;
	
	@Override
	public Iterable<ArchGame> getAllGames() {
		return archGameDao.findAll();
	}
}

