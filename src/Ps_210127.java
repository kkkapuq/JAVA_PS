import com.cware.netshopping.tv.domain.TvAttendBenefitVO;

public class Ps_210127 {
	public void Ps_210127() {
		double tmpRandom = (Math.random() * 100);
		double tmpRatePrev = 0, tmpRateNext = 0;
		int result = 0;
		//�Ҽ� ��°�ڸ����� ����
		tmpRandom = Math.round(tmpRandom * 100) / 100.0;
		TvAttendBenefitVO eventBenefit = new TvAttendBenefitVO();
		
		for(int i = 0; i < eventBenefitList.size(); i++) {
			if(tmpRandom == 100) {
				//���� ������ 100�̶�� ���� ���������ִ� ���� ����
				result = Integer.parseInt(eventBenefitList.get(eventBenefitList.size()-1).getBenefitSaveamt());
				eventBenefit = eventBenefitList.get(eventBenefitList.size()-1);
				break;
			} else {
				double benefitRate = eventBenefitList.get(i).getAttendBenefitRate();
				tmpRateNext = tmpRatePrev + benefitRate;
				if(tmpRandom >= tmpRatePrev && tmpRandom < tmpRateNext) {
					result = Integer.parseInt(eventBenefitList.get(i).getBenefitSaveamt());
					eventBenefit = eventBenefitList.get(i);
					break;
				} else {
					tmpRatePrev = tmpRateNext;
				}
			}
		}
	}
}
