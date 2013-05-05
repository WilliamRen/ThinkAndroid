/*
 * Copyright (C) 2013  WhiteCat ��è (www.thinkandroid.cn)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ta.util.netstate;

import com.ta.util.TALogger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * @Title NetworkStateReceiver
 * @Package com.ta.util.netstate
 * @Description ��һ���������״̬�ı�ģ���Ҫ���� <receiver
 *              android:name="com.ta.core.util.extend.net.NetworkStateReceiver"
 *              > <intent-filter> <action
 *              android:name="android.net.conn.CONNECTIVITY_CHANGE" /> <action
 *              android:name="android.cat.conn.CONNECTIVITY_CHANGE" />
 *              </intent-filter> </receiver>
 * @author ��è
 * @date 2013-1-22 ���� 9:35
 * @version V1.0
 */
public class NetworkStateReceiver extends BroadcastReceiver
{
	private static Boolean networkAvailable = false;

	@Override
	public void onReceive(Context context, Intent intent)
	{
		TALogger.i(NetworkStateReceiver.this, "����״̬�ı�.");
		if (!NetWorkUtil.isNetworkAvailable(context))
		{
			TALogger.i(NetworkStateReceiver.this, "����û������.");
			networkAvailable = false;
		} else
		{
			TALogger.i(NetworkStateReceiver.this, "�������ӳɹ�.");
			networkAvailable = true;
		}

	}

	/**
	 * ��ȡ��ǰ����״̬��trueΪ�������ӳɹ���������������ʧ��
	 * 
	 * @return
	 */
	public static Boolean isNetworkAvailable()
	{
		return networkAvailable;
	}

}