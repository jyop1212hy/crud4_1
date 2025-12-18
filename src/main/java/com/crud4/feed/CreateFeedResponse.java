package com.crud4.feed;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CreateFeedResponse {

    private final Long id;
    private final String title;
    private final String content;
}
