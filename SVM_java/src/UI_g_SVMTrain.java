import java.io.IOException;


public class UI_g_SVMTrain {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		//建立分类模型
		String scaleFile="Data/svmtra_iris.txt";
		String modelFile=scaleFile+".model";
		String argv2[]={"-c","0.5","-t","0",scaleFile,modelFile};
		SVMTrain train = new SVMTrain();		
		train.run(argv2);
	}

}
