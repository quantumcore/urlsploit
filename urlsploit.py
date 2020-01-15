from core.url_main import *
import argparse
def main():
    AnimateIntro()
    parser = argparse.ArgumentParser()
    parser.add_argument("--t", "-template", required=True,help="The template to use.")
    parser.add_argument("--p", "-payload", required=True, help="The path of payload to send.")
    args = parser.parse_args()
    
    template = args.t
    payload = args.p
    
    print(tag_ok + " Starting URLSPLOIT with Template '{t}' and payload '{payload}'.".format(t=template, payload=payload))
    print(tag_hm + " Checking if tempalate '{t}' is valid..".format(t=template))
    if(checkTemplate(template) == True):
        print(tag_ok + " Template is valid!")
    else:
        print(tag_notok + " Template '{er}' not found!? Available ones are.".format(er=template))
        for i in range(len(templates)):
            print(tag_hm + " Template : {ts}".format(ts=templates[i]))
        print(tag_ok + " Use urlsploit -template <template name> -payload <payload path>")
        exit(True)

    print(tag_hm + " Checking if payload '{p}' is valid..".format(p=payload))
    try:
        malacious_file = open(payload, "rb")
        malacious_file.close()
        print(tag_ok + " Payload is valid!")
        WebServer(template, payload)
    except FileNotFoundError:
        print(tag_notok + " '{p}' not found.".format(p=payload))
        print(tag_ok + " Use urlsploit -template <template name> -payload <payload path>")
        exit(True)
main()