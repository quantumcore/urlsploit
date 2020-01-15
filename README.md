# urlsploit
Payload delivery via URL and some social engineering.

## Running Urlsploit
```
sudo python3 urlsploit.py -t windows -p /home/user/backdoors/windows_update.exe
```
The above command will start a Legit looking fake Windows update page that triggers file download.


## Installation 
```
git clone https://github.com/quantumcore/urlsploit
cd urlsploit
python3 -m pip install -r requirements.txt
```

### Usage 
```
$ python3 urlsploit.py --help
usage: urlsploit.py [-h] --t T --p P

optional arguments:
  -h, --help          show this help message and exit
  --t T, -template T  The template to use.
  --p P, -payload P   The path of payload to send.
```

### Templates
- [x] Facebook
- [x] Google 
- [x] Twitter
- [x] Windows Update
- [ ] Discord
- [ ] Instagram
