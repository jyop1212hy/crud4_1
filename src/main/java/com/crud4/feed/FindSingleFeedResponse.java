package com.crud4.feed;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FindSingleFeedResponse {

    private final Long id;
    private final String title;
    private final String content;


}
