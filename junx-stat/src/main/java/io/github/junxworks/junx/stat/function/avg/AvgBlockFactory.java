/*
 ***************************************************************************************
 * 
 * @Title:  AvgBlockFactory.java   
 * @Package io.github.junxworks.junx.stat.function.avg   
 * @Description: (用一句话描述该文件做什么)   
 * @author: Michael
 * @date:   2018-7-12 20:49:29   
 * @version V1.0 
 * @Copyright: 2018 JunxWorks. All rights reserved. 
 * 
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package io.github.junxworks.junx.stat.function.avg;

import io.github.junxworks.junx.stat.datawindow.timewindow.SlicedBlock;
import io.github.junxworks.junx.stat.datawindow.timewindow.SlicedBlockFactory;
import io.github.junxworks.junx.stat.datawindow.timewindow.SlicedTimeBasedDataWindow;

/**
 * AvgBlock 对象的工厂类.
 *
 * @ClassName:  AvgBlockFactory
 * @author: Michael
 * @date:   2017-7-11 15:35:03
 * @since:  v1.0
 */
public class AvgBlockFactory implements SlicedBlockFactory {

	/**   
	 * <p>Title: createBlock</p>   
	 * <p>Description: </p>   
	 * @param dataWindow
	 * @return   
	 * @see io.github.junxworks.junx.stat.datawindow.timewindow.SlicedBlockFactory#createBlock(io.github.junxworks.junx.stat.datawindow.timewindow.SlicedTimeBasedDataWindow)
	 */
	@Override
	public SlicedBlock createBlock(SlicedTimeBasedDataWindow dataWindow) {
		return new AvgSlicedBlock();
	}

}