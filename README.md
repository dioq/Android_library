# 步骤

## 生成 library

创建 module
File -> New -> New Module -> Android Library
编译
Build -> Make Selected Modules

生成的 library 位置
build -> outputs

## 使用

### 导入已经编译好的库

将生成的 库(core-debug.aar) 复制到 libs 目录下
如: libs/core-debug.aar

File > Project Structure > Dependencies -> Modules -> name -> + -> JAR/AAR Dependencies
在 Step 1 处填路径如: libs/core-debug.aar
最后点 OK 即可

### 导入自己工程中的 module

File > Project Structure > Dependencies -> Modules -> name -> + -> Module Dependencies
选择对应的 module 名
最后点 OK 即可
