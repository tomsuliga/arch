package org.suliga.arch.dao;

import org.springframework.data.repository.CrudRepository;
import org.suliga.arch.model.ArchGame;

//public interface GameDao extends PagingAndSortingRepository<Game, Long> {
public interface ArchGameDao extends CrudRepository<ArchGame, Long> {

}
