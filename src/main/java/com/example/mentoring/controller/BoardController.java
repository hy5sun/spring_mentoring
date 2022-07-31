package com.example.mentoring.controller;

import com.example.mentoring.entity.Board;
import com.example.mentoring.service.BoardService;
import lombok.RequiredArgsConstructor;
import com.example.mentoring.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //RestAPI 서버
@RequiredArgsConstructor //생성자

public class BoardController {
    private final BoardService boardService;

    // 게시글 전체 조회
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/api/boards")
    public Response getBoards() {
        return Response.success(boardService.getBoards());
    }

    // 게시글 단건 조회
    @ResponseStatus(HttpStatus.OK) //상태 코드는 컨트롤러에서 지정해주는 게 좋다.
    @GetMapping("/api/boards/{id}")
    public Response getBoard(@PathVariable("id") Long id) {
        return Response.success(boardService.getBoard(id));
    }

    // 게시글 작성
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/boards")
    public Response save(@RequestBody Board board) {
        return Response.success(boardService.save(board));
    }

    // PUT 게시글 수정
    // 게시글 수정 -> 완료 버튼 -> 백엔드 서버 요청 (id, updateBoard)
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/api/boards/{id}")
    public Response editBoard(@PathVariable("id") Long id, @RequestBody Board board) {
        return Response.success(boardService.editBoard(id, board));
    }


    // DELETE 게시글 삭제
    @DeleteMapping("/api/boards/{id}")
    public Response deleteBoard(@PathVariable("id") Long id) {
        boardService.deleteBoard(id);
        return Response.success("게시글 삭제 완료");
    }
}