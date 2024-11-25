package com.ssafy.travlog.notification.mapper;

import java.util.List;

import com.ssafy.travlog.notification.model.PushSubscriptionModel;

public interface PushSubscriptionMapper {
	int deletePushSubscription(long pushSubscriptionId);

	PushSubscriptionModel selectPushSubscriptionByPushSubscriptionId(long pushSubscriptionId);

	List<PushSubscriptionModel> selectPushSubscriptionsByMemberId(long memberId);
}
