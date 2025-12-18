package com.crud4.feed;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateFeedRequest {

    private String title;
    private String content;


}
