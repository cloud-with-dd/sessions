FROM nginx
WORKDIR /usr/share/nginx/html
COPY ./src/build/ .
COPY ./nginx.conf /etc/nginx/conf.d/default.conf
CMD ["nginx", "-g", "daemon off;"]