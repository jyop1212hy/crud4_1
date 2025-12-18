package com.crud4.feed;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<Feed, Long> {
    Feed findByDeletedAtIsNull(Long feedId);
}
