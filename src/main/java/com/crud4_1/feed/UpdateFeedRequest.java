package com.crud4_1.feed;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UpdateFeedRequest {

    private String title;
    private String content;
}
