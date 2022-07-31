package com.example.mentoring.advice;

import com.example.mentoring.exception.BoardNotFoundException;
import com.example.mentoring.exception.WriterNotFoundException;
import org.springframework.http.HttpStatus;
import com.example.mentoring.response.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //@RestController + @Advice
public class ExceptionAdvice {
    //Exception을 관리하는 통제소!

    //404 NOT_FOUND 에러 : 찾으려고 하는 게시글이 없어요
    @ExceptionHandler(BoardNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Response boardNotFoundException() {
        return Response.failure(404, "게시글을 찾을 수 없습니다.");
    }

    //404 NotFound : 작성자가 없어요
    @ExceptionHandler(WriterNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Response writerNotFoundException() {
        return Response.failure(404, "작성자를 입력해주세요.");
    }
}
