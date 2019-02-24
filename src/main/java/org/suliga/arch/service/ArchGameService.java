package org.suliga.arch.service;

import org.suliga.arch.model.ArchGame;

public interface ArchGameService {
	//Game getGame(String sessionId);
	//Game newGame(String sessionId);
	//void saveGame(String sessionId);
	Iterable<ArchGame> getAllGames();
	//Game loadGame(String sessionId, long gameId);
}