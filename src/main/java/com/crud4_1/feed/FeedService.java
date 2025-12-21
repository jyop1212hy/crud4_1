package com.crud4_1.feed;


import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class FeedService {

    private final FeedRepository feedRepository;


    /**
     * 게시글 생성
     */
    @Transactional
    public CreateFeedResponse created(CreateFeedRequest request) {

        //엔터티 등록
        Feed feed = new Feed(request.getTitle(), request.getContent());

        //데이터베이스 저장
        Feed seavdfeed = feedRepository.save(feed);

        //DTO 반환
        return new CreateFeedResponse(seavdfeed.getId(), seavdfeed.getTitle(), seavdfeed.getContent());
    }


    /**
     * 게시글 단건 조회
     */
    @Transactional
    public FindSingleFeedResponse findSingle(Long feedId) {

        // 입력한 ID 데이터베이스 검증 하기
        Feed feed = feedRepository.findById(feedId)
                .orElseThrow(() -> new IllegalArgumentException("입력한 아이디의 게시물이 없습니다."));

        // DTO 반환
        return new FindSingleFeedResponse(
                feed.getId(),
                feed.getTitle(),
                feed.getContent()
        );
    }

    /**
     * 게시글 다건 조회
     */

    /**
     * 게시글 수정
     */
    @Transactional
    public UpdateFeedResponse update(Long feedId, UpdateFeedRequest request) {

        // 입력한 ID 데이터베이스 검증 하기
        Feed findFeed = feedRepository.findById(feedId)
                .orElseThrow(() -> new IllegalArgumentException("입력한 아이디의 게시물이 없습니다."));

        // 엔터티 등록
        findFeed.update(request.getTitle(), request.getContent());

        // DTO 반환
        return new UpdateFeedResponse(
                findFeed.getId(),
                findFeed.getTitle(),
                findFeed.getContent());
    }


    /**
     * 게시글 삭제
     */
    @Transactional
    public DeleteFeedResponse delete(Long feedId) {

        // 입력한 ID 데이터베이스 검증 하기
        Feed findFeed = feedRepository.findByDeletedAtIsNull(feedId);
//                .orElseThrow(() -> new IllegalArgumentException("입력한 아이디의 게시물이 없습니다."));

        //소프트 삭제
        findFeed.softDelete();

        return new DeleteFeedResponse(findFeed.getId());
    }


}
