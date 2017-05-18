import socketserver
import sys

class MyTCPHandler(socketserver.BaseRequestHandler): #(상속받는 클래스)
    def handle(self):   #Override
        print('클라이언트 접속: {0} '.format(self.client_address[0])) #{0}인덱스, .format(0) 0인덱스에 들어갈 값
        sock = self.request     #self.request.recv를 하기엔 너무 길어서 self.request를 소켓에 넣었다

        rbuff = sock.recv(1024)  # 데이터를 수신하고 그 결과를 rbuff에 담습니다 rbuff는 bytes 형식입니다.
        received = str(rbuff, encoding='utf-8')
        print('수신 : {0}'.format(received))

        # 수신한 데이터를 그대로 돌려보냄
        sock.send(rbuff)  # 수신한 데이터를 그대로 클라이언트에게 다시 송신
        print('송신 : {0} '.format(received))
        sock.close()

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('{0} <Bind IP>'.format(sys.argv[0]))
        sys.exit()

    bindIP = sys.argv[1]
    bindPort = 5425  # 임의 서버 포트 지정
    server = socketserver.TCPServer((bindIP, bindPort), MyTCPHandler)   #핸들러를 재정의해서 사용
    print('서버 시작..')
    server.serve_forever()  # 클라이언트로부터 접속 요청을 받아들일 준비