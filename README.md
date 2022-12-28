
./mvnw spring-boot:build-image

kubectl create deployment demo-k8s --image=vjkhambe/demo-k8s --dry-run -o=yaml > deployment.yaml

echo --- >> deployment.yaml


kubectl create service clusterip demo-k8s --tcp=8080:8080 --dry-run -o=yaml >> deployment.yaml


kubectl apply -f deployment.yaml

kubectl get all

kubectl port-forward svc/demo-k8s 8080:8080


kubectl get deployment demo-k8s -o yaml | linkerd inject - | kubectl apply -f -
