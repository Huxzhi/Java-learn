package ccbupt.task09.Test03;

public class Test03 {
	public static void main(String[] args) {
		MusicCup1 musicCup1=new MusicCup1();
		MusicCup2 musicCup2=new MusicCup2();
		musicCup1.addWater();
		musicCup1.addWater();
		musicCup1.addWater();
		musicCup1.playMusic();
		musicCup2.addWater();
		musicCup2.playMusic();
	}
		
}
interface Cup{
	void addWater();
	void deleteWater();
}
interface MusicPlayer{
	void playMusic();
}
class MusicCup1 implements Cup, MusicPlayer{

	int water=0;
	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("播放音乐，《希望の花》");
	}

	@Override
	public void addWater() {
		// TODO Auto-generated method stub
		if(water==5){
			System.out.println("水满了");
		}
		water++;
		System.out.println("水杯里的水增加了，现在水量为：" + water);
	}

	@Override
	public void deleteWater() {
		// TODO Auto-generated method stub
		if(water==0){
			System.out.println("水杯没水了");
		}
		water--;
		System.out.println("喝水，水杯的水减少了，现在水量为：" + water);
	}
	
}
class MusicCup2 implements Cup, MusicPlayer{

	int water=0;
	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("播放音乐，《林明生之歌》");
	}

	@Override
	public void addWater() {
		// TODO Auto-generated method stub
		if(water==5){
			System.out.println("水满了");
		}
		water++;
		System.out.println("水杯里的水增加了，现在水量为：" + water);
	}

	@Override
	public void deleteWater() {
		// TODO Auto-generated method stub
		if(water==0){
			System.out.println("水杯没水了");
		}
		water--;
		System.out.println("喝水，水杯的水减少了，现在水量为：" + water);
	}
	
}