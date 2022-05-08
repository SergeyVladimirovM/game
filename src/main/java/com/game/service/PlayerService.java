package com.game.service;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.net.ContentHandler;
import java.util.List;

public interface PlayerService {

    //1. получать список всех зарегистрированных игроков;
    public Page<Player> findAll(Specification<Player> specification, Pageable pageable);

    //2. создавать нового игрока;
    void create(Player player);

    //3. редактировать характеристики существующего игрока;
    boolean edit(Player player, Long id);

    //4. удалять игрока;
    boolean delete(Long id);

    //5. получать игрока по id;
    Player findId(long id);

    //6. получать отфильтрованный список игроков в соответствии с переданными фильтрами;
    List<Player> filterPlayer(String filter);

    //7. получать количество игроков, которые соответствуют фильтрам.
    Integer filterAmount(String filter);

    public Specification<Player> filterByName(String name);

    public Specification<Player> filterByTitle(String title);

    public Specification<Player> filterByRace(Race race);

    public Specification<Player> filterByProfession(Profession profession);

    public Specification<Player> filterByExperience(Integer min,Integer max);

    public Specification<Player> filterByLevel(Integer min,Integer max);

    public Specification<Player> filterByBirthday(Long after, Long before);

    public Specification<Player> filterByBanned(Boolean isBanned);
}
