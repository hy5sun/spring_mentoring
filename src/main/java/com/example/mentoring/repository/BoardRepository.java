package com.example.mentoring.repository;

import com.example.mentoring.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface BoardRepository extends JpaRepository <Board, Long> {
}
