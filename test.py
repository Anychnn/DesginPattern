import shutil
import os

def copyDirTree(root_src_dir,root_dest_dir,ignore_dirs):
	for src_dir,dirs,files in os.walk(root_src_dir):
		dest_dir=src_dir.replace(root_src_dir,root_dest_dir,1)

		src_path_except_root=src_dir.replace(root_src_dir,"",1)

		ignore_flag =False
		for ignore_dir in ignore_dirs:
			if ignore_dir == src_path_except_root[0:len(ignore_dir)]:
				ignore_flag = True
				break;


		if ignore_flag:
			continue

		# print dest_dir
		if not os.path.exists(dest_dir):
			os.makedirs(dest_dir)
		for file in files:
			src_file = os.path.join(src_dir,file)
			dst_file = os.path.join(dest_dir,file)
			shutil.copy(src_file,dst_file)

ignore_dirs=["libHDiffPatch","minizip/aes"]

root_src_dir="clib/"
root_dest_dir="tmp/"

if os.path.exists(root_dest_dir):
	shutil.rmtree(root_dest_dir)

copyDirTree(root_src_dir,root_dest_dir,ignore_dirs)