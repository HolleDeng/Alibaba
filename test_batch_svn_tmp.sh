#!/bin/bash
if [ $# -lt 2 ]
then
	echo "please input args: begintime,endtime. examp:1533891600 1533891600"
	exit 1
fi

beginTime=$1
endTime=$2

while [ $beginTime -le $endTime ]
do
  echo "processing data time : $beginTime"
  datahour=`date -d @$beginTime "+%y%m%d%H" `
  echo "./copy_slice_data.sh $datahour "
  sh ./copy_slice_data.sh $datahour  

sleep 10
let beginTime=$beginTime+3600
done

echo "the task successed"
