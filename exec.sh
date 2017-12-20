#!/bin/sh
#javaの引数を省略して実行するためのスクリプト

mode="$1"
if [ "$mode" = gen ]
then
    #字句と構文定義ファイルから解析木を生成する
    java -cp .:antlr-3.5.2-complete.jar org.antlr.Tool $2
elif [ "$mode" = c ]
then
    #javaソースファイルをコンパイルする
    counter=1
    args=""
    while [ $counter -lt $# ]
    do
        counter=`expr $counter + 1`
        args="${args} ${!counter}"
    done
    javac -cp .:antlr-3.5.2-complete.jar $args
else
    #LogoInterpreterを実行する
    execClass="Main" #実行するメインクラス名
    java -cp .:antlr-3.5.2-complete.jar $execClass $2
fi
