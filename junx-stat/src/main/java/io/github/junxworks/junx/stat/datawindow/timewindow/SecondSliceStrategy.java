/*
 ***************************************************************************************
 * 
 * @Title:  SecondSliceStrategy.java   
 * @Package io.github.junxworks.junx.stat.datawindow.timewindow   
 * @Description: (用一句话描述该文件做什么)   
 * @author: Michael
 * @date:   2018-7-12 20:49:28   
 * @version V1.0 
 * @Copyright: 2018 JunxWorks. All rights reserved. 
 * 
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package io.github.junxworks.junx.stat.datawindow.timewindow;

import io.github.junxworks.junx.core.util.DateUtils;
import io.github.junxworks.junx.stat.datawindow.SlicedBlock;

/**
 * 基于秒的时间窗口切分策略，如果单位是秒，那么每个切分块就是1秒
 *
 * @author: Michael
 * @date:   2017-5-17 17:55:02
 * @since:  v1.0
 */
public class SecondSliceStrategy extends UnitBasedSliceStrategy {

	@Override
	public void setExpireTimePoint(SlicedBlock block, long eventTimestamp) {
		block.setExpireTimePoint(DateUtils.parseDate(DateUtils.formatDate(eventTimestamp, DateUtils.DEFAULT_FORMAT)).getTime());//根据事件时间戳计算出当前block的过期时间点
	}

	@Override
	public void setPacemakerTime(SlicedBlock block) {
		block.setPacemakerTime(block.getExpireTimePoint() + TimeUnit.second.getMillis()-1); //少一毫秒
	}

}
