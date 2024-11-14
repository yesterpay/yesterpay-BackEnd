package com.yesterpay.bingo.controller;

import com.yesterpay.bingo.dto.BingoBoardResponseDTO;
import com.yesterpay.bingo.dto.BingoStatusResponseDTO;
import com.yesterpay.bingo.service.BingoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BingoController {

    private final BingoService bingoService;

    @GetMapping("/bingo/board")
    public ResponseEntity<List<BingoBoardResponseDTO>> bingoBoard(@RequestParam Long memberId) {
        List<BingoBoardResponseDTO> bingoBoard = bingoService.getBingoBoard(memberId);
        return ResponseEntity.ok(bingoBoard);
    }

    @GetMapping("/bingo/status")
    public ResponseEntity<BingoStatusResponseDTO> bingoStatus(@RequestParam Long memberId) {
        BingoStatusResponseDTO bingoStatus = bingoService.getBingoStatus(memberId);
        return ResponseEntity.ok(bingoStatus);
    }

}