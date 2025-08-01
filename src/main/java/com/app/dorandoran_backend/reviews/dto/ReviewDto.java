package com.app.dorandoran_backend.reviews.dto;

import com.app.dorandoran_backend.reviews.entity.ReviewPost;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ReviewDto {
    private Long reviewId;
    private Long bookId;
    private String bookTitle;
    private String coverImageUrl;
    private String content;
    private Byte rating;
    private LocalDateTime createdAt;
    private String nickname;
    private String profileImage;

    public static ReviewDto from(ReviewPost review) {
        return ReviewDto.builder()
                .reviewId(review.getId())
                .bookId(review.getBook().getId())
                .bookTitle(review.getBook().getTitle())
                .coverImageUrl(review.getBook().getCoverImageUrl())
                .content(review.getContent())
                .rating(review.getRating())
                .createdAt(review.getCreatedAt())
                .nickname(review.getMember().getNickname())
                .profileImage(review.getMember().getProfileImage())
                .build();
    }
}

