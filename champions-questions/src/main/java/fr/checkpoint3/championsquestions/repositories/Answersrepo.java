package fr.checkpoint3.championsquestions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.checkpoint3.championsquestions.entities.Answers;

public interface Answersrepo extends JpaRepository<Answers, Long> {

}
