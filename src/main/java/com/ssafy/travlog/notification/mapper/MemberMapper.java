package com.ssafy.travlog.notification.mapper;

import com.ssafy.travlog.notification.model.MemberModel;

public interface MemberMapper {

    MemberModel selectMemberByMemberId(long memberId);

    MemberModel selectMemberByLoginId(String loginId);

    MemberModel selectMemberByPublicId(String publicId);
}
