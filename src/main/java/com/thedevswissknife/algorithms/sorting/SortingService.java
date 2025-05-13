package com.thedevswissknife.algorithms.sorting;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SortingService {

    private final List<SortingSolver> solvers;

    public List<Integer> sort(SortingRequestDTO request) {
        return solvers.stream()
                .filter(s -> s.supports(request.algorithm()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unsupported algorithm: " + request.algorithm()))
                .sort(request.input());
    }
}
