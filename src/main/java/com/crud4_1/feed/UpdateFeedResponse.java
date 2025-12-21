package com.crud4_1.feed;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UpdateFeedResponse {

    private final Long id;
    private final String title;
    private final String content;
}
