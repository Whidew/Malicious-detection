在eclipse中新建一个项目，将src文件夹中的文件拷贝到该项目的src文件夹中，将Data和lib两个文件夹拷贝到项目的根目录下中

在左侧项目框内右击->build path->add external archieves…->然后找到当前项目的lib文件夹中的libsvm.jar，选中jar包导入即可

先执行Train的入口文件: UI_g_SVMTrain.java，训练svm分类器
再执行Test的入口文件:  TextCategorizationMain.java，进行测试数据的分类