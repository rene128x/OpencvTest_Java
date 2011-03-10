#!/bin/bash
cd bin
for file in *; do
	name="${file/.class}"
	cmd="javah $name"
	eval $cmd
done

mv *.h ../OpencvTest_Cpp/lib
