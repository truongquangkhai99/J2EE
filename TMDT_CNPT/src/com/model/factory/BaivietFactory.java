package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class BaivietFactory {
	public static boolean Save(Baiviet baiviet )
	{
		return HiberHelper.Save(baiviet);
	}
	public static boolean Remove(Baiviet baiviet)
	{
		return HiberHelper.Remove(baiviet);
	}
	public static List<Baiviet> GetAll()
	{
		return HiberHelper.ToList("from Baiviet");
	}
	public static Baiviet Get(int id)
	{
		return (Baiviet)HiberHelper.ToList("from Baiviet where ma_baiviet="+id).get(0);
	}
}
