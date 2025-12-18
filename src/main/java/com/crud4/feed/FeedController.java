package com.crud4.feed;

import com.crud4.common.apiResponse.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/feeds")
public class FeedController {

    private final FeedService feedService;

    /**
     * 게시글 생성
     */
    @PostMapping("/feed")
    public ResponseEntity<ApiResponse<CreateFeedResponse>> feedCreated(@RequestBody CreateFeedRequest request) {
        CreateFeedResponse created = feedService.created(request);
        ApiResponse<CreateFeedResponse> apiResponse = new ApiResponse("created", 200, created);
        ResponseEntity<ApiResponse<CreateFeedResponse>> response = ResponseEntity.ok(apiResponse);
        return response;
    }

    /**
     * 게시글 단건 조회
     */
    @GetMapping("/feed/{feedId}")
    public ResponseEntity<ApiResponse<FindSingleFeedResponse>> findSingleFeed(@PathVariable Long feedId) {
        FindSingleFeedResponse created = feedService.findSingle(feedId);
        ApiResponse<FindSingleFeedResponse> apiResponse = new ApiResponse("created", 200, created);
        ResponseEntity<ApiResponse<FindSingleFeedResponse>> response = ResponseEntity.ok(apiResponse);
        return response;
    }

    /**
     * 게시글 다건 조회
     */


    /**
     * 게시글 수정
     */
    @PutMapping("/feed/{feedId}")
    public ResponseEntity<ApiResponse<UpdateFeedResponse>> updateResponse(@PathVariable Long feedId, @RequestBody UpdateFeedRequest request) {

        UpdateFeedResponse created = feedService.update(feedId, request);
        ApiResponse<UpdateFeedResponse> apiResponse = new ApiResponse("created", 200, created);
        ResponseEntity<ApiResponse<UpdateFeedResponse>> response = ResponseEntity.ok(apiResponse);
        return response;
    }


    /**
     * 게시글 삭제
     */
    @DeleteMapping("/feed/{feedId}")
    public ResponseEntity<ApiResponse<DeleteFeedResponse>> deleteResponse(@PathVariable Long feedId) {

        DeleteFeedResponse delete = feedService.delete(feedId);
        ApiResponse<DeleteFeedResponse> apiResponse = new ApiResponse<>("Success", 200, delete);
        ResponseEntity<ApiResponse<DeleteFeedResponse>> response = ResponseEntity.ok(apiResponse);
        return response;
    }


}
