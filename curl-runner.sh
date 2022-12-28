while true; 
do
  echo "Request \n"	 
  content=$(curl "http://10.105.156.13:8080/actuator/health")
  echo "Response = $content \n"
done
