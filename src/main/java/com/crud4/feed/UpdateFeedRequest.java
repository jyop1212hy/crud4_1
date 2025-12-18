package com.crud4.feed;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UpdateFeedRequest {

    private String title;
    private String content;
}
