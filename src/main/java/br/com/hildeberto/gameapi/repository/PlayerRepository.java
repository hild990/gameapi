package br.com.hildeberto.gameapi.repository;

import br.com.hildeberto.gameapi.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
}
