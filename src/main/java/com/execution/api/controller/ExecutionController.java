package com.execution.api.controller;

import com.execution.api.dto.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 外部API実行コントローラー
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class ExecutionController {
  private final RestTemplate restTemplate;

  /**
   * 外部APIを実行
   * @return String 文字列
   */
  @GetMapping("/")
  public Post getMessage() {
    String url = "https://jsonplaceholder.typicode.com/posts/1";
    return restTemplate.getForObject(url, Post.class);
  }
}
