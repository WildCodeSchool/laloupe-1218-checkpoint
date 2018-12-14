package fr.checkpoint3.championsquestions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.checkpoint3.championsquestions.entities.Question;

public interface QuestionRepo extends JpaRepository<Question, Long> {

}
