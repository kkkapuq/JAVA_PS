import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ps_210127_1 {
	public void ratePick() {
		double tmpRandom = (Math.random() * 100);
		double tmpRatePrev = 0, tmpRateNext = 0;
		int result = 0;
		//�Ҽ� ��°�ڸ����� ����
		tmpRandom = Math.round(tmpRandom * 100) / 100.0;
		
		System.out.println("������ ������" + tmpRandom);
		
		HashMap<String, String> map = new HashMap<String, String>();
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();

		map.put("rate", "20");
		map.put("value", "100");
		list.add(map);
		//map.clear();
		//ó���� clear�� ��µ�, list�� ���Ե� map���� clear �ع����� ������ ����. ���� �����������!
		map = new HashMap<String, String>();

		map.put("rate", "20");
		map.put("value", "200");
		list.add(map);
		map = new HashMap<String, String>();
		
		map.put("rate", "20");
		map.put("value", "300");
		list.add(map);
		map = new HashMap<String, String>();
		
		map.put("rate", "10");
		map.put("value", "500");
		list.add(map);
		map = new HashMap<String, String>();
		
		map.put("rate", "10");
		map.put("value", "1000");
		list.add(map);
		map = new HashMap<String, String>();
		
		map.put("rate", "10");
		map.put("value", "1500");
		list.add(map);
		map = new HashMap<String, String>();
		
		map.put("rate", "5");
		map.put("value", "2000");
		list.add(map);
		map = new HashMap<String, String>();
		
		map.put("rate", "5");
		map.put("value", "3000");
		list.add(map);
		map.clear();
		map = new HashMap<String, String>();
		
		
		for(int i = 0; i < list.size(); i++) {
			if(tmpRandom == 100) {
				//���� ������ 100�̶�� ���� ���������ִ� list �ε����� �ִ� value ����
				result = Integer.parseInt(list.get(list.size()-1).get("value"));
				break;
			} else {
				double rate = Double.parseDouble(list.get(i).get("rate"));
				tmpRateNext = tmpRatePrev + rate;
				if(tmpRandom >= tmpRatePrev && tmpRandom < tmpRateNext) {
					result = Integer.parseInt(list.get(i).get("value"));
					break;
				} else {
					tmpRatePrev = tmpRateNext;
				}
			}
		}
		
		System.out.println(result + " ���� ��÷�Ǿ����ϴ�.");
		
	}
}
