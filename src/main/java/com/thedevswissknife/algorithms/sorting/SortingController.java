package com.thedevswissknife.algorithms.sorting;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/algorithms/sorting")
@RequiredArgsConstructor
public class SortingController {

    private final SortingService sortingService;

    @PostMapping
    public ResponseEntity<List<Integer>> sort(@RequestBody SortingRequestDTO request) {
        return ResponseEntity.ok(sortingService.sort(request));
    }
}
