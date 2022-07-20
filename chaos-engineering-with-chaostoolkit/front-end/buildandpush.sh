#build and push container image
cd src
npm run build
cd ..
docker build -t cloudwithdd/reactwebapp .
docker push cloudwithdd/reactwebapp